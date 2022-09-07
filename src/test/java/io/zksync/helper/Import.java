package io.zksync.helper;

import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class Import extends Contract {
    public static final String BINARY = "0x00000097011001970000009804000041000000000014037600000099010000410000000000210376000000000130004c000000080000613d025500090000034f025500760000034f00040000000000020000008001000039000000400300003900000000001303760000000002000357000000000220004c0000002e0000c13d000200000003001d0000009a02000041000000a40300003900000000002303760000009b02000041000000000021037600000084020000390000000000020376000000c4020000390000000000020376000000e40200003900000000001203760000010401000039000000000001037600008006010000390000009c020000410000000003000356000000040330008a00000020033000c9004901d10000034f0000009d01000041000000040110017f0000000002010378000000000320004c000000300000c13d00000060021000390000004001100039000000000101037800000002050000290000004c0000013d000000000100001900000257000103720000009e01200197000100000001001d00000000010000190255023b0000034f0000009f011001970000000102000029000000000121019f0000000002000019025502390000034f00000099010000410000000001010375000000000110004c000000420000c13d0000000201000029000000000101037500000000020000190000000003000019025502460000034f0000002001000039000000a0020000410000000000120376000000a1010000410000000000010376000000a2010000410000025600010370000000000200001900000000010000190000000205000029000000a3040000410000000000240376000000a40200004100000000001203760000001f0310018f000000000404037500000000020503750000000505100270000000000650004c0000005f0000613d0000000006000019000000050760021000000000087200190000000007740019000000000707037800000000007803760000000106600039000000000756004b000000570000413d000000000530004c0000006f0000613d000000200500008a000000000151016f000000000414001900000000011200190000000303300210000000000501037500000000053501cf000000000535022f00000000040403780000010003300089000000000434022f00000000033401cf000000000353019f00000000003103760000009d01200197000000a40200004100000000020203750000004002200210000000a502200197000000000112019f000002570001037200060000000000020000000001000350000080020210008c000000930000613d0000000002000351000080010220008c000000930000613d000000a602000041000000a7030000410000000000230376000000a80200004100000000001203760000800201000039000000a9020000410000000003000356000000060330008a00000020033000c9025502050000034f000000ff01000039000000050110024f000000000110004c000000910000613d0000009d01000041000000060110017f0000000001010378000000000110004c000000930000c13d0000000001000019000002560001037000000080060000390000004005000039000000000065037600000099010000410000000001010375000000030110008c000000b80000a13d000000980100004100000000010103750000000001010377000000e001100270000000aa0210009c000000ba0000613d000000ab0110009c000000b80000c13d0000000001000357000000000110004c000000d00000c13d00000099010000410000000001010375000000040110008a000000010200008a000000ac03000041000000000221004b00000000020000190000000002032019000000ac01100197000000ac0410009c0000000003008019000000ac01100167000000ac0110009c00000000010200190000000001036019000000000110004c000000d40000c13d00000000010000190000025700010372000000000100001900000257000103720000000001000357000000000110004c000000d20000c13d00000099010000410000000001010375000000040110008a000000010200008a000000ac03000041000000000221004b00000000020000190000000002032019000000ac01100197000000ac0410009c0000000003008019000000ac01100167000000ac0110009c00000000010200190000000001036019000000000110004c000000e20000c13d0000000001000019000002570001037200000000010000190000025700010372000000000100001900000257000103720000000001000019000200000005001d0255023b0000034f000000020a00002900000000080a0375000000ad02000041000000000028037600000000020003550000009e01100197000000040310008c000000ea0000c13d000000a4010000410000000001010375000001020000013d0000000001000019000200000006001d0255023b0000034f0000009e0110019700000002020000290000000000120376000000b7010000410000025600010370000100000008001d0000009d038001970000006002200210000000ae02200197000000000223019f000000af022001c70000000003000356000000040330008a00000020033000c9019802050000034f000000ff01000039000000030210024f00000004010000290000009d03100197000000a304000041000000000034037600000040011002700000009d01100197000000a4030000410000000000130376000000000220004c000000020a00002900000001080000290000019e0000613d0000001f0210018f000000a30300004100000000040303750000000503100270000000000530004c000001110000613d0000000005000019000000050650021000000000076800190000000006640019000000000606037800000000006703760000000105500039000000000635004b000001090000413d000000200300008a000000000520004c000001210000613d000000000531016f000000000454001900000000055800190000000302200210000000000605037500000000062601cf000000000626022f00000000040403780000010002200089000000000424022f00000000022401cf000000000262019f00000000002503760000001f02100039000000000432016f0000000002840019000000000442004b000000000400001900000001040040390000009d0520009c0000013a0000213d000000010440018f000000000440004c0000013a0000c13d00000000002a0376000000ac04000041000000200510008c00000000050000190000000005044019000000ac06100197000000000760004c000000000400a019000000ac0660009c000000000405c019000000000440004c000001410000613d00000000010000190000025700010372000000b5010000410000000000100376000000410100003900000004020000390000000000120376000000b60100004100000257000103720000000004080375000000b10540009c000001460000413d00000000010000190000025700010372000000000181001900000000058400190000001f04500039000000ac06000041000000000714004b00000000070000190000000007064019000000ac04400197000000ac08100197000000000984004b000000000600a019000000000484013f000000ac0440009c00000000040700190000000004066019000000000440004c000001610000613d0000000004050375000000b10640009c000001630000413d000000b5010000410000000000100376000000410100003900000004020000390000000000120376000000b6010000410000025700010372000000000100001900000257000103720000003f06400039000000000336016f0000000003230019000000b10630009c0000016f0000413d000000b5010000410000000000100376000000410100003900000004020000390000000000120376000000b601000041000002570001037200000000003a0376000000000042037600000020035000390000000005430019000000000115004b000001770000a13d000000000100001900000257000103720000002001200039000000000540004c000001820000613d000000000500001900000000061500190000000007530019000000000707037500000000007603760000002005500039000000000645004b0000017b0000413d0000000003140019000000000003037600000000040a0375000200000004001d000000200300003900000000003403760000000003020375000100000003001d000000200240003900000000003203760000004002400039025501c40000034f00000002010000290000009d0110019700000001020000290000004002200210000000b202200041000000b302200197000000b402200041000000b302200197000000000112019f0000025600010370000000a3010000410000000000010376000000a40100004100000000000103760000000001000019000000020a000029000000b0041001970000001f0310018f000000a302000041000000000502037500000000020a03750000000501100270000000000610004c000001af0000613d0000000006000019000000050760021000000000087200190000000007750019000000000707037800000000007803760000000106600039000000000716004b000001a70000413d000000000130004c000001bd0000613d000000000145001900000000044200190000000303300210000000000504037500000000053501cf000000000535022f00000000010103780000010003300089000000000131022f00000000013101cf000000000151019f00000000001403760000009d01200197000000a40200004100000000020203750000004002200210000000a502200197000000000112019f0000025700010372000000000430004c000001ce0000613d000000000400001900000000052400190000000006140019000000000606037500000000006503760000002004400039000000000534004b000001c70000413d00000000012300190000000000010376000000000001036f0002000000000002000200000003001d0000002003300039000100000003001d000001ea002103630000000205000029000000200250011a000000000201001f0000000106000029000000202160011a000000000126004900000003022002100000010003200089000000200110011a000000010331025f000000000101003100000000042101cf000000000343019f000000000220004c000000000103c019000000200260011a000000ac021001cd00000000010500190000000200000005000000000001036f0000000103000029000000020500002900000000020000190000000102004039000000010220018f000000000220004c000002040000c13d000000200250011a000000000201001f0000000006030019000000202160011a000000000126004900000003022002100000010003200089000000200110011a000000010331025f000000000101003100000000042101cf000000000343019f000000000220004c000000000103c019000000200260011a000000b80210019d00000000010500190000000200000005000000000001036f00000000000103710002000000000002000200000003001d0000002003300039000100000003001d0000021e002103650000000205000029000000200250011a000000000201001f0000000106000029000000202160011a000000000126004900000003022002100000010003200089000000200110011a000000010331025f000000000101003100000000042101cf000000000343019f000000000220004c000000000103c019000000200260011a000000ac021001cd00000000010500190000000200000005000000000001036f0000000103000029000000020500002900000000020000190000000102004039000000010220018f000000000220004c000002380000c13d000000200250011a000000000201001f0000000006030019000000202160011a000000000126004900000003022002100000010003200089000000200110011a000000010331025f000000000101003100000000042101cf000000000343019f000000000220004c000000000103c019000000200260011a000000b80210019d00000000010500190000000200000005000000000001036f0000000000010371000000000012035b000000000001036f0000000001010359000000000001036f000000000401037500000000043401cf000000000434022f0000010003300089000000000232022f00000000023201cf000000000242019f0000000000210376000000000001036f0000000504300270000000000540004c0000024e0000613d00000000002103760000002001100039000000010440008a000000000540004c000002490000c13d0000001f0330018f000000000430004c000002540000613d00000003033002100255023d0000034f000000000001036f000000000001036f000002550000037400000256000103700000025700010372000000000000e001000000000000e001000000000000e001000000000000e0010000000000000000000000000000000000000000000000000000000000ffffff0000000000000000000000000000000000000000000000000000000000ffffe00000000000000000000000000000000000000000000000000000000000ffffc000753d4204365b3c66bf7c886b007d26329e20717ec6435335f6a6a6cb12c993e2e9718a8df58e8e8a2c7f7d47a4341921919036d7ea1e9d26c3559996f155420000000000000000000000000000000000000000000000a40000000000000080000000000000000000000000000000000000000000000000ffffffffffffffff000000000000000000000000ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e000000000000000000000000000000000000000000000000000000000000000e000200000000000000000000000000000000000000000000000400000000000e000000000000000000000000000000000000000000000000000000000000000ffffa00000000000000000000000000000000000000000000000000000000000ffff8000000000000000000000000000000000ffffffffffffffff00000000000000001806aa1896bbf26568e884a7374b41e002500962caba6a15023a8d90e8508b830000000000000000000000000000000000000000000000000000000000fff8000000000000000000000000000000000000000000000000000000000000fff8040000000000000000000000000000000000000000000000240000000000fff80000000000000000000000000000000000000000000000000000000000c298557800000000000000000000000000000000000000000000000000000000c6261261800000000000000000000000000000000000000000000000000000000000000006fdde030000000000000000000000000000000000000000000000000000000000000000000000000000000000000000ffffffff0000000000000000000000000000000000000000000000000000000000000000000000040000000000000000000000000000000000000000000000000000000000000000ffffffffffffffe0000000000000000000000000000000000000000000000001000000000000000000000000000000000000000000000000000000000000001f000000000000000000000000000000000000000000000000ffffffffffffffe0000000000000000000000000000000000000000000000000000000000000004000000000000000004e487b7100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000024000000000000000000000000000000000000000000000000000000000000002000000000000000807fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff";
    public static final String FOO_BINARY = "0x0000005d011001970000005e0400004100000000001403760000005f010000410000000000210376000000000130004c000000080000613d017000090000034f0170007b0000034f00040000000000020000008001000039000000400200003900000000001203760000000001000357000000000110004c000000280000c13d0000000001000019017001560000034f000000010210018f00000001011002700000007f0310018f000000000420004c000000000301c0190000001f0130008c00000000010000190000000101002039000000010110018f000000000220004c0000000002000019000000010200c039000000010220018f000000000112004b0000002a0000613d000000670100004100000000001003760000002201000039000000040200003900000000001203760000006801000041000001720001037200000000010000190000017200010372000000200130008c0000004b0000413d000200000003001d0000000000000376000080100100003900000060020000410000000003000356000000040330008a00000020033000c9017001200000034f00000004020000290000006101200197000000ff03000039000000030330024f000000000330004c0000005d0000613d000000000201037800000002010000290000001f0110003900000005011002700000000003120019000000000132004b0000004b0000813d000100000003001d000200000002001d00000000010000190000000202000029017001540000034f000000010300002900000002020000290000000102200039000000000132004b000000420000413d00000063010000410000000002000019017001540000034f0000005f010000410000000001010375000000000110004c000000560000c13d000000800100003900000000020000190000000003000019017001610000034f0000002001000039000000640200004100000000001203760000006501000041000000000001037600000066010000410000017100010370000000400220027000000062032001970000001f0420018f00000061022001970000000505200270000000000650004c0000006c0000613d000000000600001900000005076002100000000008710019000000000808037800000000008703760000000106600039000000000756004b000000650000413d000000000540004c000000790000613d0000000304400210000000000503037500000000054501cf000000000545022f000000000131001900000000010103780000010004400089000000000141022f00000000014101cf000000000151019f00000000001303760000004001200210000001720001037200060000000000020000000001000350000080020210008c000000980000613d0000000002000351000080010220008c000000980000613d00000069020000410000006a0300004100000000002303760000006b02000041000000000012037600008002010000390000006c020000410000000003000356000000060330008a00000020033000c9017001200000034f000000ff01000039000000050110024f000000000110004c000000960000613d0000006101000041000000060110017f0000000001010378000000000110004c000000980000c13d000000000100001900000171000103700000005f010000410000000001010375000000030110008c000000b80000a13d0000005e01000041000000000101037500000000010103770000006d011001970000006e0110009c000000b80000c13d0000000001000357000000000110004c000000ba0000c13d0000005f010000410000000001010375000000040110008a000000010200008a0000006f03000041000000000221004b000000000200001900000000020320190000006f011001970000006f0410009c00000000030080190000006f011001670000006f0110009c00000000010200190000000001036019000000000110004c000000bc0000c13d0000000001000019000001720001037200000000010000190000017200010372000000000100001900000172000103720000000001000019017001560000034f000000010210018f00000001031002700000007f0430018f000000000520004c000000000503001900000000050460190000001f0350008c00000000030000190000000103002039000000010330018f000000000420004c0000000004000019000000010400c039000000010440018f000000000334004b000000d50000613d000000670100004100000000001003760000002201000039000000040200003900000000001203760000006801000041000001720001037200000080040000390000000000540376000000000220004c000000e10000c13d000001000200008a000000000121016f000000a0020000390000000000120376000000000150004c000000c001000039000000a001006039000000f90000013d000000bf01000039000000a0030000390000000000000376000000000250004c000001060000613d000100000004001d00000070030000410000000001000019000200000005001d000400000003001d000300000001001d0000000001030019017001560000034f000000030400002900000004030000290000000205000029000000a002400039000000000012037600000001033000390000002001400039000000000251004b000000ea0000413d000000c00140003900000001040000290000001f01100039000000200200008a000000000321016f000000800230008a000000710220009c000001060000a13d000000670100004100000000001003760000004101000039000000040200003900000000001203760000006801000041000001720001037200000040020000390000000000320376000000200200003900000000002303760000000002040375000000200430003900000000002403760000004003300039000000000420004c000001180000613d00000000040000190000000005430019000000a006400039000000000606037500000000006503760000002004400039000000000524004b000001110000413d000000000323001900000000000303760000006201100197000000400220021000000072022000410000007302200197000000000112019f00000171000103700002000000000002000200000003001d0000002003300039000100000003001d00000139002103650000000205000029000000200250011a000000000201001f0000000106000029000000202160011a000000000126004900000003022002100000010003200089000000200110011a000000010331025f000000000101003100000000042101cf000000000343019f000000000220004c000000000103c019000000200260011a0000006f021001cd00000000010500190000000200000005000000000001036f0000000103000029000000020500002900000000020000190000000102004039000000010220018f000000000220004c000001530000c13d000000200250011a000000000201001f0000000006030019000000202160011a000000000126004900000003022002100000010003200089000000200110011a000000010331025f000000000101003100000000042101cf000000000343019f000000000220004c000000000103c019000000200260011a000000740210019d00000000010500190000000200000005000000000001036f0000000000010371000000000012035b000000000001036f0000000001010359000000000001036f000000000401037500000000043401cf000000000434022f0000010003300089000000000232022f00000000023201cf000000000242019f0000000000210376000000000001036f0000000504300270000000000540004c000001690000613d00000000002103760000002001100039000000010440008a000000000540004c000001640000c13d0000001f0330018f000000000430004c0000016f0000613d0000000303300210017001580000034f000000000001036f000000000001036f000001700000037400000171000103700000017200010372000000000000e0010000000000000000000000000000000000000000000000000000000000ffffff0000000000000000000000000000000000000000000000000000000000ffffe00000000000000000000000000000000000000000000000000000000000ffffc00000000000000000000000000000000000000000000000200000000000000000000000000000000000000000000000000000000000000000ffffffffffffffff000000000000000000000000000000000000000000000000ffffffffffffffe0466f6f00000000000000000000000000000000000000000000000000000000060000000000000000000000000000000000000000000000000000000000e000000000000000000000000000000000000000000000000000000000000000e000200000000000000000000000000000000000000000000000400000000000e000004e487b710000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002400000000000000001806aa1896bbf26568e884a7374b41e002500962caba6a15023a8d90e8508b830000000000000000000000000000000000000000000000000000000000fff8000000000000000000000000000000000000000000000000000000000000fff8040000000000000000000000000000000000000000000000240000000000fff800ffffffff0000000000000000000000000000000000000000000000000000000006fdde03000000000000000000000000000000000000000000000000000000008000000000000000000000000000000000000000000000000000000000000000290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e563000000000000000000000000000000000000000000000000ffffffffffffff7f00000000000000000000000000000000000000000000005f000000000000000000000000000000000000000000000000ffffffffffffffe000000000000000007fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff";
    public static final String FUNC_FOO = "foo";

    public static final String FUNC_GETFOONAME = "getFooName";

    @Deprecated
    protected Import(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Import(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Import(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Import(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> foo() {
        final Function function = new Function(FUNC_FOO, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> getFooName() {
        final Function function = new Function(FUNC_GETFOONAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static Function encodeGetFooName() {
        return new Function(FUNC_GETFOONAME,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
    }

    @Deprecated
    public static Import load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Import(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Import load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Import(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Import load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Import(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Import load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Import(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Import> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Import.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Import> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Import.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Import> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Import.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Import> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Import.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}