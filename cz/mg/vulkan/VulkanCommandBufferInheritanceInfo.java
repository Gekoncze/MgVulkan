package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandBufferInheritanceInfo.html">khronos documentation</a>
 **/
public class VulkanCommandBufferInheritanceInfo extends VulkanObject {
    public VulkanCommandBufferInheritanceInfo(){
        super(new VkCommandBufferInheritanceInfo());
    }

    public VulkanCommandBufferInheritanceInfo(VkCommandBufferInheritanceInfo vk){
        super(vk);
    }

    @Override
    public VkCommandBufferInheritanceInfo getVk(){
        return (VkCommandBufferInheritanceInfo) super.getVk();
    }
    public VulkanCommandBufferInheritanceInfo(VulkanObject pNext, VulkanRenderPass renderPass, VulkanUInt32 subpass, VulkanFramebuffer framebuffer, VulkanBool32 occlusionQueryEnable, VulkanQueryControlFlags queryFlags, VulkanQueryPipelineStatisticFlags pipelineStatistics) {
        super(new VkCommandBufferInheritanceInfo(pNext.getVk(), renderPass.getVk(), subpass.getVk(), framebuffer.getVk(), occlusionQueryEnable.getVk(), queryFlags.getVk(), pipelineStatistics.getVk()));
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

    public VulkanRenderPass getRenderPass() {
        return new VulkanRenderPass(getVk().getRenderPass());
    }

    public void setRenderPass(VulkanRenderPass renderPass) {
        getVk().setRenderPass(renderPass.getVk());
    }

    public VulkanUInt32 getSubpass() {
        return new VulkanUInt32(getVk().getSubpass());
    }

    public void setSubpass(VulkanUInt32 subpass) {
        getVk().setSubpass(subpass.getVk());
    }

    public VulkanFramebuffer getFramebuffer() {
        return new VulkanFramebuffer(getVk().getFramebuffer());
    }

    public void setFramebuffer(VulkanFramebuffer framebuffer) {
        getVk().setFramebuffer(framebuffer.getVk());
    }

    public VulkanBool32 getOcclusionQueryEnable() {
        return new VulkanBool32(getVk().getOcclusionQueryEnable());
    }

    public void setOcclusionQueryEnable(VulkanBool32 occlusionQueryEnable) {
        getVk().setOcclusionQueryEnable(occlusionQueryEnable.getVk());
    }

    public VulkanQueryControlFlags getQueryFlags() {
        return new VulkanQueryControlFlags(getVk().getQueryFlags());
    }

    public void setQueryFlags(VulkanQueryControlFlags queryFlags) {
        getVk().setQueryFlags(queryFlags.getVk());
    }

    public VulkanQueryPipelineStatisticFlags getPipelineStatistics() {
        return new VulkanQueryPipelineStatisticFlags(getVk().getPipelineStatistics());
    }

    public void setPipelineStatistics(VulkanQueryPipelineStatisticFlags pipelineStatistics) {
        getVk().setPipelineStatistics(pipelineStatistics.getVk());
    }


    public static class Array extends VulkanCommandBufferInheritanceInfo implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferInheritanceInfo> {
        public Array(VkCommandBufferInheritanceInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandBufferInheritanceInfo.Array(count));
        }

        public Array(int count, VulkanCommandBufferInheritanceInfo o){
            this(new VkCommandBufferInheritanceInfo.Array(count, o.getVk()));
        }

        @Override
        public VkCommandBufferInheritanceInfo.Array getVk(){
            return (VkCommandBufferInheritanceInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandBufferInheritanceInfo get(int i){
            return new VulkanCommandBufferInheritanceInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandBufferInheritanceInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandBufferInheritanceInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandBufferInheritanceInfo.Pointer(value));
        }

        @Override
        public VkCommandBufferInheritanceInfo.Pointer getVk(){
            return (VkCommandBufferInheritanceInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandBufferInheritanceInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferInheritanceInfo.Pointer> {
            public Array(int count) {
                super(new VkCommandBufferInheritanceInfo.Pointer.Array(count));
            }

            public Array(VulkanCommandBufferInheritanceInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandBufferInheritanceInfo.Pointer.Array getVk(){
                return (VkCommandBufferInheritanceInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandBufferInheritanceInfo.Pointer get(int i){
                return new VulkanCommandBufferInheritanceInfo.Pointer(getVk().get(i));
            }
        }
    }
}
