package cz.mg.vulkan;

public class PFNvkInvalidateMappedMemoryRanges extends VkFunctionPointer {
    public PFNvkInvalidateMappedMemoryRanges() {
    }

    protected PFNvkInvalidateMappedMemoryRanges(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkInvalidateMappedMemoryRanges(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkInvalidateMappedMemoryRanges(long value) {
        setValue(value);
    }

    public PFNvkInvalidateMappedMemoryRanges(VkInstance instance) {
        super(instance, new VkString("vkInvalidateMappedMemoryRanges"));
    }

    public int call(VkDevice device, int memoryRangeCount, VkMappedMemoryRange pMemoryRanges){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), memoryRangeCount, pMemoryRanges != null ? pMemoryRanges.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, int memoryRangeCount, long pMemoryRanges);

}
