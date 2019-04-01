package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDispatchBase.html">khronos documentation</a>
 **/
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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, baseGroupX != null ? baseGroupX.getVkAddress() : VkPointer.NULL_ADDRESS, baseGroupY != null ? baseGroupY.getVkAddress() : VkPointer.NULL_ADDRESS, baseGroupZ != null ? baseGroupZ.getVkAddress() : VkPointer.NULL_ADDRESS, groupCountX != null ? groupCountX.getVkAddress() : VkPointer.NULL_ADDRESS, groupCountY != null ? groupCountY.getVkAddress() : VkPointer.NULL_ADDRESS, groupCountZ != null ? groupCountZ.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long baseGroupX, long baseGroupY, long baseGroupZ, long groupCountX, long groupCountY, long groupCountZ);
}
