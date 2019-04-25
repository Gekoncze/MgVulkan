package cz.mg.vulkan;

public class VkExternalFenceHandleTypeFlags extends VkFlags {
    public VkExternalFenceHandleTypeFlags() {
    }

    protected VkExternalFenceHandleTypeFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalFenceHandleTypeFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalFenceHandleTypeFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalFenceHandleTypeFlags(int value) {
        setValue(value);
    }
}
