package cz.mg.vulkan;

import cz.mg.vulkan.jna.enums.VkResult;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanException extends RuntimeException {
    private final String functionName;
    private final int errorCode;

    public VulkanException(VkResult result, String functionName) {
        super(functionName + ": " + ToString.constantToString(result.value, result.getClass()) + " (" + result.value + ")");
        this.functionName = functionName;
        this.errorCode = result.value;
    }

    public String getFunctionName() {
        return functionName;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
