package io.zksync.helper;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
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
public class CounterContract extends Contract {
    public static final String BINARY = "0x0000002b04000041000000000141016f0000002c0400004100000000001403760000002d010000410000000000210376000000000130004c000000090000613d00a5000a0000034f00a5001f0000034f0000008001000039000000400200003900000000001203760000000001000357000000000110004c0000001d0000c13d0000002d010000410000000001010375000000000110004c000000180000c13d00000080010000390000000002000019000000000300001900a500960000034f0000002001000039000000000010037600000000000103760000002e01000041000000a6000103700000000001000019000000a70001037200010000000000020000008006000039000000400500003900000000006503760000002d010000410000000001010375000000040110008c0000005a0000413d0000002c01000041000000000101037500000000010103770000002f02000041000000000121016f000000300210009c000000440000c13d0000000001000357000000000110004c0000005c0000c13d0000002d010000410000000001010375000000040110008a000000010200008a0000003203000041000000000221004b00000000020000190000000002032019000000000131016f000000000431013f000000320110009c00000000010000190000000001034019000000320340009c000000000102c019000000000110004c0000005e0000c13d0000000001000019000000a700010372000000310110009c0000005a0000c13d0000000001000357000000000110004c000000650000c13d0000002d010000410000000001010375000000040110008a00000032020000410000001f0310008c00000000030000190000000003022019000000000121016f000000000410004c0000000002008019000000320110009c00000000010300190000000001026019000000000110004c000000670000c13d0000000001000019000000a7000103720000000001000019000000a7000103720000000001000019000000a7000103720000000001000019000100000006001d00a5008b0000034f000000010200002900000000001203760000003401000041000000a6000103700000000001000019000000a7000103720000002c01000041000000000101037500000004011000390000000001010377000100000005001d00a500720000034f000000010100002900000000010103750000003302000041000000000121016f000000a6000103700002000000000002000000010200008a000100000001001d000000000121013f000200000001001d000000000100001900a5008b0000034f0000000202000029000000000221004b000000820000213d00000001020000290000000001210019000000000200001900a500890000034f0000000200000005000000000001036f000000350100004100000000001003760000001101000039000000040200003900000000001203760000003601000041000000a700010372000000000012035b000000000001036f0000000001010359000000000001036f000000000401037500000000043401cf000000000434022f0000010003300089000000000232022f00000000023201cf000000000242019f0000000000210376000000000001036f0000000504300270000000000540004c0000009e0000613d00000000002103760000002001100039000000010440008a000000000540004c000000990000c13d0000001f0330018f000000000430004c000000a40000613d000000030330021000a5008d0000034f000000000001036f000000000001036f000000a500000374000000a600010370000000a700010372000000000000e001000000000000e001000000000000e001000000000000e0010000000000000000000000000000000000000000000000000000000000ffffff0000000000000000000000000000000000000000000000000000000000ffffe00000000000000000000000000000000000000000000000000000000000ffffc00000000000000000000000000000000000000000000000400000000000000000ffffffff000000000000000000000000000000000000000000000000000000006d4ce63c000000000000000000000000000000000000000000000000000000007cf5dab0000000000000000000000000000000000000000000000000000000008000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000ffffffffffffffff00000000000000000000000000000000000000000000002000000000000000804e487b71000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000240000000000000000";
    public static final String FUNC_GET = "get";

    public static final String FUNC_INCREMENT = "increment";

    @Deprecated
    protected CounterContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected CounterContract(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected CounterContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected CounterContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> get() {
        final Function function = new Function(FUNC_GET, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> increment(BigInteger x) {
        final Function function = new Function(
                FUNC_INCREMENT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(x)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static Function encodeIncrement(BigInteger _value) {
        return new Function(
                FUNC_INCREMENT,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_value)),
                Collections.<TypeReference<?>>emptyList());
    }

    public static Function encodeGet() {
        return new Function(FUNC_GET,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    }

    @Deprecated
    public static CounterContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new CounterContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static CounterContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new CounterContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static CounterContract load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new CounterContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static CounterContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new CounterContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<CounterContract> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(CounterContract.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<CounterContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(CounterContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<CounterContract> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(CounterContract.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<CounterContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(CounterContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
