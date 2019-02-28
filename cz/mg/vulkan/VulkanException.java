package cz.mg.vulkan;

import cz.mg.vulkan.enums.VulkanResult;
import cz.mg.vulkan.jna.enums.VkResult;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanException extends RuntimeException {
    private final String functionName;
    private final int errorCode;
    private final VulkanResult result;

    public VulkanException(VkResult result, String functionName) {
        super(functionName + ": " + ToString.constantToString(result.value, result.getClass()) + " (" + result.value + ")");
        this.functionName = functionName;
        this.errorCode = result.value;
        this.result = VulkanResult.fromNativeEnum(result);
    }

    public String getFunctionName() {
        return functionName;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public VulkanResult getResult() {
        return result;
    }
}
