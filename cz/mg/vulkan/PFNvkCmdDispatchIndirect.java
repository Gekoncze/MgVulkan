package cz.mg.vulkan;

public class PFNvkCmdDispatchIndirect extends VkFunctionPointer {
    public PFNvkCmdDispatchIndirect() {
    }

    public PFNvkCmdDispatchIndirect(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDispatchIndirect(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdDispatchIndirect(long value) {
        setValue(value);
    }

    public PFNvkCmdDispatchIndirect(VkInstance instance) {
        super(instance, new VkString("vkCmdDispatchIndirect"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long buffer, long offset);
}
