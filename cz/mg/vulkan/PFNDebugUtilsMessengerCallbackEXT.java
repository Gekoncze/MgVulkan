package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDebugUtilsMessengerCallbackEXT.html">khronos documentation</a>
 **/
public class PFNDebugUtilsMessengerCallbackEXT extends VulkanFunctionPointer {
    public PFNDebugUtilsMessengerCallbackEXT(){
        super(new PFNvkDebugUtilsMessengerCallbackEXT());
    }

    public PFNDebugUtilsMessengerCallbackEXT(PFNvkDebugUtilsMessengerCallbackEXT vk){
        super(vk);
    }

    @Override
    public PFNvkDebugUtilsMessengerCallbackEXT getVk(){
        return (PFNvkDebugUtilsMessengerCallbackEXT) super.getVk();
    }

    public PFNDebugUtilsMessengerCallbackEXT(long value){
        super(value);
    }
}
