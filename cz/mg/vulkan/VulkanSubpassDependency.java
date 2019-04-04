package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSubpassDependency.html">khronos documentation</a>
 **/
public class VulkanSubpassDependency extends VulkanObject {
    public VulkanSubpassDependency(){
        super(new VkSubpassDependency());
    }

    public VulkanSubpassDependency(VkSubpassDependency vk){
        super(vk);
    }

    @Override
    public VkSubpassDependency getVk(){
        return (VkSubpassDependency) super.getVk();
    }

    public VulkanSubpassDependency(VulkanUInt32 srcSubpass, VulkanUInt32 dstSubpass, VulkanPipelineStageFlags srcStageMask, VulkanPipelineStageFlags dstStageMask, VulkanAccessFlags srcAccessMask, VulkanAccessFlags dstAccessMask, VulkanDependencyFlags dependencyFlags) {
        super(new VkSubpassDependency(srcSubpass.getVk(), dstSubpass.getVk(), srcStageMask.getVk(), dstStageMask.getVk(), srcAccessMask.getVk(), dstAccessMask.getVk(), dependencyFlags.getVk()));
    }

    public VulkanUInt32 getSrcSubpass() {
        return new VulkanUInt32(getVk().getSrcSubpass());
    }

    public void setSrcSubpass(VulkanUInt32 srcSubpass) {
        getVk().setSrcSubpass(srcSubpass.getVk());
    }

    public VulkanUInt32 getDstSubpass() {
        return new VulkanUInt32(getVk().getDstSubpass());
    }

    public void setDstSubpass(VulkanUInt32 dstSubpass) {
        getVk().setDstSubpass(dstSubpass.getVk());
    }

    public VulkanPipelineStageFlags getSrcStageMask() {
        return new VulkanPipelineStageFlags(getVk().getSrcStageMask());
    }

    public void setSrcStageMask(VulkanPipelineStageFlags srcStageMask) {
        getVk().setSrcStageMask(srcStageMask.getVk());
    }

    public VulkanPipelineStageFlags getDstStageMask() {
        return new VulkanPipelineStageFlags(getVk().getDstStageMask());
    }

    public void setDstStageMask(VulkanPipelineStageFlags dstStageMask) {
        getVk().setDstStageMask(dstStageMask.getVk());
    }

    public VulkanAccessFlags getSrcAccessMask() {
        return new VulkanAccessFlags(getVk().getSrcAccessMask());
    }

    public void setSrcAccessMask(VulkanAccessFlags srcAccessMask) {
        getVk().setSrcAccessMask(srcAccessMask.getVk());
    }

    public VulkanAccessFlags getDstAccessMask() {
        return new VulkanAccessFlags(getVk().getDstAccessMask());
    }

    public void setDstAccessMask(VulkanAccessFlags dstAccessMask) {
        getVk().setDstAccessMask(dstAccessMask.getVk());
    }

    public VulkanDependencyFlags getDependencyFlags() {
        return new VulkanDependencyFlags(getVk().getDependencyFlags());
    }

    public void setDependencyFlags(VulkanDependencyFlags dependencyFlags) {
        getVk().setDependencyFlags(dependencyFlags.getVk());
    }


    public static class Array extends VulkanSubpassDependency implements cz.mg.collections.array.ReadonlyArray<VulkanSubpassDependency> {
        public Array(VkSubpassDependency.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSubpassDependency.Array(count));
        }

        public Array(int count, VulkanSubpassDependency o){
            this(new VkSubpassDependency.Array(count, o.getVk()));
        }

        @Override
        public VkSubpassDependency.Array getVk(){
            return (VkSubpassDependency.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSubpassDependency get(int i){
            return new VulkanSubpassDependency(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSubpassDependency.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSubpassDependency.Pointer());
        }

        public Pointer(long value) {
            this(new VkSubpassDependency.Pointer(value));
        }

        @Override
        public VkSubpassDependency.Pointer getVk(){
            return (VkSubpassDependency.Pointer) super.getVk();
        }

        public static class Array extends VulkanSubpassDependency.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSubpassDependency.Pointer> {
            public Array(int count) {
                super(new VkSubpassDependency.Pointer.Array(count));
            }

            public Array(VulkanSubpassDependency[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSubpassDependency.Pointer.Array getVk(){
                return (VkSubpassDependency.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSubpassDependency.Pointer get(int i){
                return new VulkanSubpassDependency.Pointer(getVk().get(i));
            }
        }
    }
}
