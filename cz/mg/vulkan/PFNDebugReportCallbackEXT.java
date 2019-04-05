package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class PFNDebugReportCallbackEXT extends VulkanFunctionPointer {
    public PFNDebugReportCallbackEXT(){
        super(new PFNvkDebugReportCallbackEXT());
    }

    public PFNDebugReportCallbackEXT(PFNvkDebugReportCallbackEXT vk){
        super(vk);
    }

    @Override
    public PFNvkDebugReportCallbackEXT getVk(){
        return (PFNvkDebugReportCallbackEXT) super.getVk();
    }

    public PFNDebugReportCallbackEXT(long value){
        super(value);
    }
}
