package cz.mg.vulkan;

public class PFNvkCmdSetScissor extends VkFunctionPointer {
    public PFNvkCmdSetScissor() {
    }

    public PFNvkCmdSetScissor(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetScissor(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetScissor(long value) {
        setValue(value);
    }

    public PFNvkCmdSetScissor(VkInstance instance) {
        super(instance, new VkString("vkCmdSetScissor"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 firstScissor, VkUInt32 scissorCount, VkRect2D pScissors){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), firstScissor != null ? firstScissor.getVkAddress() : VkPointer.getSinkAddress(), scissorCount != null ? scissorCount.getVkAddress() : VkPointer.getSinkAddress(), pScissors != null ? pScissors.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long firstScissor, long scissorCount, long pScissors);
}
