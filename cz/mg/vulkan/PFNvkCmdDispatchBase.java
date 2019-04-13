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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), baseGroupX != null ? baseGroupX.getVkAddress() : VkPointer.getSinkAddress(), baseGroupY != null ? baseGroupY.getVkAddress() : VkPointer.getSinkAddress(), baseGroupZ != null ? baseGroupZ.getVkAddress() : VkPointer.getSinkAddress(), groupCountX != null ? groupCountX.getVkAddress() : VkPointer.getSinkAddress(), groupCountY != null ? groupCountY.getVkAddress() : VkPointer.getSinkAddress(), groupCountZ != null ? groupCountZ.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long baseGroupX, long baseGroupY, long baseGroupZ, long groupCountX, long groupCountY, long groupCountZ);
}
