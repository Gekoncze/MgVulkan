package cz.mg.vulkan;

public class VkDebugUtilsMessengerCallbackDataFlagsEXT extends VkFlags {
    public VkDebugUtilsMessengerCallbackDataFlagsEXT() {
    }

    protected VkDebugUtilsMessengerCallbackDataFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDebugUtilsMessengerCallbackDataFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugUtilsMessengerCallbackDataFlagsEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkDebugUtilsMessengerCallbackDataFlagsEXT(int value) {
        setValue(value);
    }
}
