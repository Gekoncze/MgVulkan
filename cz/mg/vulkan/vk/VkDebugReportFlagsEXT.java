package cz.mg.vulkan.vk;

public class VkDebugReportFlagsEXT extends VkFlags {
    public VkDebugReportFlagsEXT() {
    }

    public VkDebugReportFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugReportFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugReportFlagsEXT(int value) {
        setValue(value);
    }
}
