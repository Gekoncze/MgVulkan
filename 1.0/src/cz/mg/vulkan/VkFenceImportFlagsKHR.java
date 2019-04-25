package cz.mg.vulkan;

public class VkFenceImportFlagsKHR extends VkFlags {
    public VkFenceImportFlagsKHR() {
    }

    protected VkFenceImportFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkFenceImportFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkFenceImportFlagsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkFenceImportFlagsKHR(int value) {
        setValue(value);
    }
}
