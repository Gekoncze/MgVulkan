package cz.mg.vulkan;

public class VkFenceImportFlags extends VkFlags {
    public VkFenceImportFlags() {
    }

    protected VkFenceImportFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkFenceImportFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkFenceImportFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkFenceImportFlags(int value) {
        setValue(value);
    }
}
