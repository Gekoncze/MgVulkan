package cz.mg.vulkan;

public class VkFenceImportFlagsKHR extends VkFlags {
    public VkFenceImportFlagsKHR() {
    }

    public VkFenceImportFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFenceImportFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkFenceImportFlagsKHR(int value) {
        setValue(value);
    }
}
