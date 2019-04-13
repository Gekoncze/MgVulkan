package cz.mg.vulkan;

public class PFNvkCmdDrawIndirect extends VkFunctionPointer {
    public PFNvkCmdDrawIndirect() {
    }

    public PFNvkCmdDrawIndirect(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDrawIndirect(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdDrawIndirect(long value) {
        setValue(value);
    }

    public PFNvkCmdDrawIndirect(VkInstance instance) {
        super(instance, new VkString("vkCmdDrawIndirect"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkUInt32 drawCount, VkUInt32 stride){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getSinkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getSinkAddress(), drawCount != null ? drawCount.getVkAddress() : VkPointer.getSinkAddress(), stride != null ? stride.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long buffer, long offset, long drawCount, long stride);
}
