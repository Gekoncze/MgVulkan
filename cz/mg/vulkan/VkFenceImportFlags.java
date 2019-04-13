package cz.mg.vulkan;

public class VkFenceImportFlags extends VkFlags {
    public VkFenceImportFlags() {
    }

    public VkFenceImportFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFenceImportFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkFenceImportFlags(int value) {
        setValue(value);
    }
}
