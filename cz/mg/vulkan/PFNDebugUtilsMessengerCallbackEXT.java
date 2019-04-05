package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

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
