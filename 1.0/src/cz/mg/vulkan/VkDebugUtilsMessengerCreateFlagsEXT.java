package cz.mg.vulkan;

public class VkDebugUtilsMessengerCreateFlagsEXT extends VkFlags {
    public VkDebugUtilsMessengerCreateFlagsEXT() {
    }

    protected VkDebugUtilsMessengerCreateFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDebugUtilsMessengerCreateFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugUtilsMessengerCreateFlagsEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkDebugUtilsMessengerCreateFlagsEXT(int value) {
        setValue(value);
    }
}
