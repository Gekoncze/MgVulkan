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

    public int call(VkDevice device, int memoryRangeCount, VkMappedMemoryRange pMemoryRanges){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), memoryRangeCount, pMemoryRanges != null ? pMemoryRanges.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, int memoryRangeCount, long pMemoryRanges);

}
