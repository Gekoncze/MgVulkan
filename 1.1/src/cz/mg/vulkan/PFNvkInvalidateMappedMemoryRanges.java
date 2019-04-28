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

    public void call(VkDevice device, VkUInt32 memoryRangeCount, VkMappedMemoryRange pMemoryRanges, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), memoryRangeCount != null ? memoryRangeCount.getVkAddress() : VkPointer.getNullAddressNative(), pMemoryRanges != null ? pMemoryRanges.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long memoryRangeCount, long pMemoryRanges, long rval);


    public int call(VkDevice device, int memoryRangeCount, VkMappedMemoryRange pMemoryRanges){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), memoryRangeCount, pMemoryRanges != null ? pMemoryRanges.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, int memoryRangeCount, long pMemoryRanges);

}
