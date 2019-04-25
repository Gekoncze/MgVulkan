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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), memoryRangeCount != null ? memoryRangeCount.getVkAddress() : VkPointer.getNullAddressNative(), pMemoryRanges != null ? pMemoryRanges.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long memoryRangeCount, long pMemoryRanges, long rval);
}
