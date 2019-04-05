package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanRenderPassCreateInfo extends VulkanObject {
    public VulkanRenderPassCreateInfo(){
        super(new VkRenderPassCreateInfo());
    }

    public VulkanRenderPassCreateInfo(VkRenderPassCreateInfo vk){
        super(vk);
    }

    @Override
    public VkRenderPassCreateInfo getVk(){
        return (VkRenderPassCreateInfo) super.getVk();
    }
    public VulkanRenderPassCreateInfo(VulkanObject pNext, VulkanRenderPassCreateFlags flags, VulkanUInt32 attachmentCount, VulkanAttachmentDescription pAttachments, VulkanUInt32 subpassCount, VulkanSubpassDescription pSubpasses, VulkanUInt32 dependencyCount, VulkanSubpassDependency pDependencies) {
        super(new VkRenderPassCreateInfo(pNext.getVk(), flags.getVk(), attachmentCount.getVk(), pAttachments.getVk(), subpassCount.getVk(), pSubpasses.getVk(), dependencyCount.getVk(), pDependencies.getVk()));
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

    public VulkanRenderPassCreateFlags getFlags() {
        return new VulkanRenderPassCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanRenderPassCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getAttachmentCount() {
        return new VulkanUInt32(getVk().getAttachmentCount());
    }

    public void setAttachmentCount(VulkanUInt32 attachmentCount) {
        getVk().setAttachmentCount(attachmentCount.getVk());
    }

    public VulkanAttachmentDescription getPAttachments() {
        return new VulkanAttachmentDescription(getVk().getPAttachments());
    }

    public void setPAttachments(VulkanAttachmentDescription pAttachments) {
        getVk().setPAttachments(pAttachments.getVk());
    }

    public VulkanUInt32 getSubpassCount() {
        return new VulkanUInt32(getVk().getSubpassCount());
    }

    public void setSubpassCount(VulkanUInt32 subpassCount) {
        getVk().setSubpassCount(subpassCount.getVk());
    }

    public VulkanSubpassDescription getPSubpasses() {
        return new VulkanSubpassDescription(getVk().getPSubpasses());
    }

    public void setPSubpasses(VulkanSubpassDescription pSubpasses) {
        getVk().setPSubpasses(pSubpasses.getVk());
    }

    public VulkanUInt32 getDependencyCount() {
        return new VulkanUInt32(getVk().getDependencyCount());
    }

    public void setDependencyCount(VulkanUInt32 dependencyCount) {
        getVk().setDependencyCount(dependencyCount.getVk());
    }

    public VulkanSubpassDependency getPDependencies() {
        return new VulkanSubpassDependency(getVk().getPDependencies());
    }

    public void setPDependencies(VulkanSubpassDependency pDependencies) {
        getVk().setPDependencies(pDependencies.getVk());
    }


    public static class Array extends VulkanRenderPassCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPassCreateInfo> {
        public Array(VkRenderPassCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkRenderPassCreateInfo.Array(count));
        }

        public Array(int count, VulkanRenderPassCreateInfo o){
            this(new VkRenderPassCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkRenderPassCreateInfo.Array getVk(){
            return (VkRenderPassCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanRenderPassCreateInfo get(int i){
            return new VulkanRenderPassCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkRenderPassCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkRenderPassCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkRenderPassCreateInfo.Pointer(value));
        }

        @Override
        public VkRenderPassCreateInfo.Pointer getVk(){
            return (VkRenderPassCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanRenderPassCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPassCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkRenderPassCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanRenderPassCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkRenderPassCreateInfo.Pointer.Array getVk(){
                return (VkRenderPassCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanRenderPassCreateInfo.Pointer get(int i){
                return new VulkanRenderPassCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
