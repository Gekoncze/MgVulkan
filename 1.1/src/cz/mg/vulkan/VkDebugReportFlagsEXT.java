package cz.mg.vulkan;

public class VkDebugReportFlagsEXT extends VkFlags {
    public VkDebugReportFlagsEXT() {
    }

    protected VkDebugReportFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDebugReportFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugReportFlagsEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkDebugReportFlagsEXT(int value) {
        setValue(value);
    }
}
