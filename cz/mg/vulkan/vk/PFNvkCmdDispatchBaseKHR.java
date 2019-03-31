package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDispatchBaseKHR.html">khronos documentation</a>
 **/
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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), baseGroupX != null ? baseGroupX.getVkAddress() : VkPointer.NULL, baseGroupY != null ? baseGroupY.getVkAddress() : VkPointer.NULL, baseGroupZ != null ? baseGroupZ.getVkAddress() : VkPointer.NULL, groupCountX != null ? groupCountX.getVkAddress() : VkPointer.NULL, groupCountY != null ? groupCountY.getVkAddress() : VkPointer.NULL, groupCountZ != null ? groupCountZ.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long baseGroupX, long baseGroupY, long baseGroupZ, long groupCountX, long groupCountY, long groupCountZ);
}
