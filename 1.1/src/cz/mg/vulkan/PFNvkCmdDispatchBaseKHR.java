package cz.mg.vulkan;

public class PFNvkCmdDispatchBaseKHR extends VkFunctionPointer {
    public PFNvkCmdDispatchBaseKHR() {
    }

    public PFNvkCmdDispatchBaseKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDispatchBaseKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDispatchBaseKHR(long value) {
        setValue(value);
    }

    public PFNvkCmdDispatchBaseKHR(VkInstance instance) {
        super(instance, new VkString("vkCmdDispatchBaseKHR"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 baseGroupX, VkUInt32 baseGroupY, VkUInt32 baseGroupZ, VkUInt32 groupCountX, VkUInt32 groupCountY, VkUInt32 groupCountZ){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), baseGroupX != null ? baseGroupX.getVkAddress() : VkPointer.getNullAddress(), baseGroupY != null ? baseGroupY.getVkAddress() : VkPointer.getNullAddress(), baseGroupZ != null ? baseGroupZ.getVkAddress() : VkPointer.getNullAddress(), groupCountX != null ? groupCountX.getVkAddress() : VkPointer.getNullAddress(), groupCountY != null ? groupCountY.getVkAddress() : VkPointer.getNullAddress(), groupCountZ != null ? groupCountZ.getVkAddress() : VkPointer.getNullAddress());
    }

    protected static native void call(long vkaddress, long commandBuffer, long baseGroupX, long baseGroupY, long baseGroupZ, long groupCountX, long groupCountY, long groupCountZ);
}
