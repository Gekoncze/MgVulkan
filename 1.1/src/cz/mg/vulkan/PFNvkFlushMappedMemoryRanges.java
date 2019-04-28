package cz.mg.vulkan;

public class PFNvkFlushMappedMemoryRanges extends VkFunctionPointer {
    public PFNvkFlushMappedMemoryRanges() {
    }

    protected PFNvkFlushMappedMemoryRanges(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkFlushMappedMemoryRanges(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkFlushMappedMemoryRanges(long value) {
        setValue(value);
    }

    public PFNvkFlushMappedMemoryRanges(VkInstance instance) {
        super(instance, new VkString("vkFlushMappedMemoryRanges"));
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
