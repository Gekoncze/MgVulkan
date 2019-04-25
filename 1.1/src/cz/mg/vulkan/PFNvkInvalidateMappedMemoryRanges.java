package cz.mg.vulkan;

public class PFNvkInvalidateMappedMemoryRanges extends VkFunctionPointer {
    public PFNvkInvalidateMappedMemoryRanges() {
    }

    public PFNvkInvalidateMappedMemoryRanges(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkInvalidateMappedMemoryRanges(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkInvalidateMappedMemoryRanges(long value) {
        setValue(value);
    }

    public PFNvkInvalidateMappedMemoryRanges(VkInstance instance) {
        super(instance, new VkString("vkInvalidateMappedMemoryRanges"));
    }

    public void call(VkDevice device, VkUInt32 memoryRangeCount, VkMappedMemoryRange pMemoryRanges, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), memoryRangeCount != null ? memoryRangeCount.getVkAddress() : VkPointer.getNullAddress(), pMemoryRanges != null ? pMemoryRanges.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    protected static native void call(long vkaddress, long device, long memoryRangeCount, long pMemoryRanges, long rval);
}
