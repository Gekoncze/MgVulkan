package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdPushDescriptorSetKHR.html">khronos documentation</a>
 **/
public class PFNvkCmdPushDescriptorSetKHR extends VkFunctionPointer {
    public PFNvkCmdPushDescriptorSetKHR() {
    }

    public PFNvkCmdPushDescriptorSetKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdPushDescriptorSetKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdPushDescriptorSetKHR(long value) {
        setValue(value);
    }

    public PFNvkCmdPushDescriptorSetKHR(VkInstance instance) {
        super(instance, new VkString("vkCmdPushDescriptorSetKHR"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, VkUInt32 set, VkUInt32 descriptorWriteCount, VkWriteDescriptorSet pDescriptorWrites){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.NULL_ADDRESS, layout != null ? layout.getVkAddress() : VkPointer.NULL_ADDRESS, set != null ? set.getVkAddress() : VkPointer.NULL_ADDRESS, descriptorWriteCount != null ? descriptorWriteCount.getVkAddress() : VkPointer.NULL_ADDRESS, pDescriptorWrites != null ? pDescriptorWrites.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long pipelineBindPoint, long layout, long set, long descriptorWriteCount, long pDescriptorWrites);
}
