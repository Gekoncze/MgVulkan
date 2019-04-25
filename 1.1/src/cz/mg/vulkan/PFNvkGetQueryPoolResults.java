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

    public void call(VkDevice device, VkQueryPool queryPool, VkUInt32 firstQuery, VkUInt32 queryCount, VkSize dataSize, VkObject pData, VkDeviceSize stride, VkQueryResultFlags flags, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddressNative(), firstQuery != null ? firstQuery.getVkAddress() : VkPointer.getNullAddressNative(), queryCount != null ? queryCount.getVkAddress() : VkPointer.getNullAddressNative(), dataSize != null ? dataSize.getVkAddress() : VkPointer.getNullAddressNative(), pData != null ? pData.getVkAddress() : VkPointer.NULL, stride != null ? stride.getVkAddress() : VkPointer.getNullAddressNative(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long queryPool, long firstQuery, long queryCount, long dataSize, long pData, long stride, long flags, long rval);
}
