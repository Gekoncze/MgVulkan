package cz.mg.vulkan;

public class PFNvkCmdDispatchBase extends VkFunctionPointer {
    public PFNvkCmdDispatchBase() {
    }

    public PFNvkCmdDispatchBase(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDispatchBase(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDispatchBase(long value) {
        setValue(value);
    }

    public PFNvkCmdDispatchBase(VkInstance instance) {
        super(instance, new VkString("vkCmdDispatchBase"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 baseGroupX, VkUInt32 baseGroupY, VkUInt32 baseGroupZ, VkUInt32 groupCountX, VkUInt32 groupCountY, VkUInt32 groupCountZ){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), baseGroupX != null ? baseGroupX.getVkAddress() : VkPointer.getNullAddress(), baseGroupY != null ? baseGroupY.getVkAddress() : VkPointer.getNullAddress(), baseGroupZ != null ? baseGroupZ.getVkAddress() : VkPointer.getNullAddress(), groupCountX != null ? groupCountX.getVkAddress() : VkPointer.getNullAddress(), groupCountY != null ? groupCountY.getVkAddress() : VkPointer.getNullAddress(), groupCountZ != null ? groupCountZ.getVkAddress() : VkPointer.getNullAddress());
    }

    protected static native void call(long vkaddress, long commandBuffer, long baseGroupX, long baseGroupY, long baseGroupZ, long groupCountX, long groupCountY, long groupCountZ);
}
