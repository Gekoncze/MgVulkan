package cz.mg.vulkan;

public class VkDebugUtilsMessageTypeFlagsEXT extends VkFlags {
    public VkDebugUtilsMessageTypeFlagsEXT() {
    }

    protected VkDebugUtilsMessageTypeFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDebugUtilsMessageTypeFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugUtilsMessageTypeFlagsEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkDebugUtilsMessageTypeFlagsEXT(int value) {
        setValue(value);
    }
}
