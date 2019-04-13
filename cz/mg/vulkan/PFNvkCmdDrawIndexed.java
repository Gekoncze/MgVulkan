package cz.mg.vulkan;

public class PFNvkCmdDrawIndexed extends VkFunctionPointer {
    public PFNvkCmdDrawIndexed() {
    }

    public PFNvkCmdDrawIndexed(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDrawIndexed(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDrawIndexed(long value) {
        setValue(value);
    }

    public PFNvkCmdDrawIndexed(VkInstance instance) {
        super(instance, new VkString("vkCmdDrawIndexed"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 indexCount, VkUInt32 instanceCount, VkUInt32 firstIndex, VkInt32 vertexOffset, VkUInt32 firstInstance){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), indexCount != null ? indexCount.getVkAddress() : VkPointer.getSinkAddress(), instanceCount != null ? instanceCount.getVkAddress() : VkPointer.getSinkAddress(), firstIndex != null ? firstIndex.getVkAddress() : VkPointer.getSinkAddress(), vertexOffset != null ? vertexOffset.getVkAddress() : VkPointer.getSinkAddress(), firstInstance != null ? firstInstance.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long indexCount, long instanceCount, long firstIndex, long vertexOffset, long firstInstance);
}
