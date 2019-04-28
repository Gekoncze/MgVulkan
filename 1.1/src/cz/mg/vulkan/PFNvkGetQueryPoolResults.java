package cz.mg.vulkan;

public class PFNvkGetQueryPoolResults extends VkFunctionPointer {
    public PFNvkGetQueryPoolResults() {
    }

    protected PFNvkGetQueryPoolResults(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetQueryPoolResults(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetQueryPoolResults(long value) {
        setValue(value);
    }

    public PFNvkGetQueryPoolResults(VkInstance instance) {
        super(instance, new VkString("vkGetQueryPoolResults"));
    }

    public int call(VkDevice device, VkQueryPool queryPool, int firstQuery, int queryCount, long dataSize, VkObject pData, long stride, int flags){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddressNative(), firstQuery, queryCount, dataSize, pData != null ? pData.getVkAddress() : VkPointer.NULL, stride, flags);
    }

    protected static native int callNative(long vkaddress, long device, long queryPool, int firstQuery, int queryCount, long dataSize, long pData, long stride, int flags);

}
