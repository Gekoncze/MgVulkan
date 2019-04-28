package cz.mg.vulkan;

public class VkDebugUtilsMessageSeverityFlagsEXT extends VkFlags {
    public VkDebugUtilsMessageSeverityFlagsEXT() {
    }

    protected VkDebugUtilsMessageSeverityFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDebugUtilsMessageSeverityFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugUtilsMessageSeverityFlagsEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkDebugUtilsMessageSeverityFlagsEXT(int value) {
        setValue(value);
    }
}
