package cz.mg.vulkan;

public class VkException extends RuntimeException {
    private final VkResult result;
    private final String functionName;

    public VkException(VkResult result, String functionName){
        this.result = result;
        this.functionName = functionName;
    }

    public VkResult getResult(){
        return result;
    }

    public String getFunctionName(){
        return functionName;
    }
}
