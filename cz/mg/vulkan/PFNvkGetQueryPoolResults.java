package cz.mg.vulkan;

public class PFNvkGetQueryPoolResults extends VkFunctionPointer {
    public PFNvkGetQueryPoolResults() {
    }

    public PFNvkGetQueryPoolResults(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetQueryPoolResults(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetQueryPoolResults(long value) {
        setValue(value);
    }

    public PFNvkGetQueryPoolResults(VkInstance instance) {
        super(instance, new VkString("vkGetQueryPoolResults"));
    }

    public void call(VkDevice device, VkQueryPool queryPool, VkUInt32 firstQuery, VkUInt32 queryCount, VkSize dataSize, VkObject pData, VkDeviceSize stride, VkQueryResultFlags flags, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddress(), firstQuery != null ? firstQuery.getVkAddress() : VkPointer.getNullAddress(), queryCount != null ? queryCount.getVkAddress() : VkPointer.getNullAddress(), dataSize != null ? dataSize.getVkAddress() : VkPointer.getNullAddress(), pData != null ? pData.getVkAddress() : VkPointer.NULL, stride != null ? stride.getVkAddress() : VkPointer.getNullAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long queryPool, long firstQuery, long queryCount, long dataSize, long pData, long stride, long flags, long rval);
}
