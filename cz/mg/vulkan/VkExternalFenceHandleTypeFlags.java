package cz.mg.vulkan;

public class VkExternalFenceHandleTypeFlags extends VkFlags {
    public VkExternalFenceHandleTypeFlags() {
    }

    public VkExternalFenceHandleTypeFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalFenceHandleTypeFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExternalFenceHandleTypeFlags(int value) {
        setValue(value);
    }
}
