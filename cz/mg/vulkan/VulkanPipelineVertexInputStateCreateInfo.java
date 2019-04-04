package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineVertexInputStateCreateInfo.html">khronos documentation</a>
 **/
public class VulkanPipelineVertexInputStateCreateInfo extends VulkanObject {
    public VulkanPipelineVertexInputStateCreateInfo(){
        super(new VkPipelineVertexInputStateCreateInfo());
    }

    public VulkanPipelineVertexInputStateCreateInfo(VkPipelineVertexInputStateCreateInfo vk){
        super(vk);
    }

    @Override
    public VkPipelineVertexInputStateCreateInfo getVk(){
        return (VkPipelineVertexInputStateCreateInfo) super.getVk();
    }
    public VulkanPipelineVertexInputStateCreateInfo(VulkanObject pNext, VulkanPipelineVertexInputStateCreateFlags flags, VulkanUInt32 vertexBindingDescriptionCount, VulkanVertexInputBindingDescription pVertexBindingDescriptions, VulkanUInt32 vertexAttributeDescriptionCount, VulkanVertexInputAttributeDescription pVertexAttributeDescriptions) {
        super(new VkPipelineVertexInputStateCreateInfo(pNext.getVk(), flags.getVk(), vertexBindingDescriptionCount.getVk(), pVertexBindingDescriptions.getVk(), vertexAttributeDescriptionCount.getVk(), pVertexAttributeDescriptions.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanPipelineVertexInputStateCreateFlags getFlags() {
        return new VulkanPipelineVertexInputStateCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineVertexInputStateCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getVertexBindingDescriptionCount() {
        return new VulkanUInt32(getVk().getVertexBindingDescriptionCount());
    }

    public void setVertexBindingDescriptionCount(VulkanUInt32 vertexBindingDescriptionCount) {
        getVk().setVertexBindingDescriptionCount(vertexBindingDescriptionCount.getVk());
    }

    public VulkanVertexInputBindingDescription getPVertexBindingDescriptions() {
        return new VulkanVertexInputBindingDescription(getVk().getPVertexBindingDescriptions());
    }

    public void setPVertexBindingDescriptions(VulkanVertexInputBindingDescription pVertexBindingDescriptions) {
        getVk().setPVertexBindingDescriptions(pVertexBindingDescriptions.getVk());
    }

    public VulkanUInt32 getVertexAttributeDescriptionCount() {
        return new VulkanUInt32(getVk().getVertexAttributeDescriptionCount());
    }

    public void setVertexAttributeDescriptionCount(VulkanUInt32 vertexAttributeDescriptionCount) {
        getVk().setVertexAttributeDescriptionCount(vertexAttributeDescriptionCount.getVk());
    }

    public VulkanVertexInputAttributeDescription getPVertexAttributeDescriptions() {
        return new VulkanVertexInputAttributeDescription(getVk().getPVertexAttributeDescriptions());
    }

    public void setPVertexAttributeDescriptions(VulkanVertexInputAttributeDescription pVertexAttributeDescriptions) {
        getVk().setPVertexAttributeDescriptions(pVertexAttributeDescriptions.getVk());
    }


    public static class Array extends VulkanPipelineVertexInputStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineVertexInputStateCreateInfo> {
        public Array(VkPipelineVertexInputStateCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineVertexInputStateCreateInfo.Array(count));
        }

        public Array(int count, VulkanPipelineVertexInputStateCreateInfo o){
            this(new VkPipelineVertexInputStateCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineVertexInputStateCreateInfo.Array getVk(){
            return (VkPipelineVertexInputStateCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineVertexInputStateCreateInfo get(int i){
            return new VulkanPipelineVertexInputStateCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineVertexInputStateCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineVertexInputStateCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineVertexInputStateCreateInfo.Pointer(value));
        }

        @Override
        public VkPipelineVertexInputStateCreateInfo.Pointer getVk(){
            return (VkPipelineVertexInputStateCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineVertexInputStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineVertexInputStateCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkPipelineVertexInputStateCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanPipelineVertexInputStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineVertexInputStateCreateInfo.Pointer.Array getVk(){
                return (VkPipelineVertexInputStateCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineVertexInputStateCreateInfo.Pointer get(int i){
                return new VulkanPipelineVertexInputStateCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
