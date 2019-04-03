package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanException extends RuntimeException {
    private final VulkanResult result;
    private final String functionName;

    public VulkanException(VulkanResult result, String functionName){
        this.result = result;
        this.functionName = functionName;
    }

    public VulkanResult getResult(){
        return result;
    }

    public String getFunctionName(){
        return functionName;
    }
}
