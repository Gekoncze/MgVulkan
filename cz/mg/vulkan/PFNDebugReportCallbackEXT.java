package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDebugReportCallbackEXT.html">khronos documentation</a>
 **/
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
