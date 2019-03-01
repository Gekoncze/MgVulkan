package cz.mg.vulkan.utilities;

import cz.mg.collections.array.Array;
import cz.mg.vulkan.enums.VulkanResult;
import cz.mg.vulkan.jna.enums.VkResult;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanException extends RuntimeException {
    private final VulkanResult result;
    private final String functionName;
    private final String[] parameters;

    public VulkanException() {
        this(null, null, (String[])null);
    }

    public VulkanException(VkResult result, String functionName) {
        this(result, functionName, (String[])null);
    }

    public VulkanException(VkResult result, String functionName, String... parameters) {
        super(genMessage(result, functionName, parameters));
        this.functionName = functionName;
        this.parameters = parameters;
        this.result = VulkanResult.fromNativeEnum(result);
    }

    private static String genMessage(VkResult result, String functionName, String[] parameters){
        String resultMessage = "";
        String functionNameMessage = "";
        String parametersMessage = "";
        if(result != null) resultMessage = ": " + genResultMessage(result);
        if(functionName != null) functionNameMessage = genFunctionNameMessage(functionName);
        if(parameters != null) parametersMessage = "(" + genParametersMessage(parameters) + ")";
        return functionNameMessage + parametersMessage + resultMessage;
    }

    private static String genResultMessage(VkResult result){
        return ToString.constantToString(result.value, result.getClass()) + " (" + result.value + ")";
    }

    private static String genFunctionNameMessage(String functionName){
        return functionName;
    }

    private static String genParametersMessage(String[] parameters){
        return new Array<>(parameters).toString(", ");
    }

    public VulkanResult getResult() {
        return result;
    }

    public String getFunctionName() {
        return functionName;
    }

    public String[] getParameters() {
        return parameters;
    }
}
