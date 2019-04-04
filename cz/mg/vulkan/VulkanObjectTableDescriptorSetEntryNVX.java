package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkObjectTableDescriptorSetEntryNVX.html">khronos documentation</a>
 **/
public class VulkanObjectTableDescriptorSetEntryNVX extends VulkanObject {
    public VulkanObjectTableDescriptorSetEntryNVX(){
        super(new VkObjectTableDescriptorSetEntryNVX());
    }

    public VulkanObjectTableDescriptorSetEntryNVX(VkObjectTableDescriptorSetEntryNVX vk){
        super(vk);
    }

    @Override
    public VkObjectTableDescriptorSetEntryNVX getVk(){
        return (VkObjectTableDescriptorSetEntryNVX) super.getVk();
    }

    public VulkanObjectTableDescriptorSetEntryNVX(VulkanObjectEntryTypeNVX type, VulkanObjectEntryUsageFlagsNVX flags, VulkanPipelineLayout pipelineLayout, VulkanDescriptorSet descriptorSet) {
        super(new VkObjectTableDescriptorSetEntryNVX(type.getVk(), flags.getVk(), pipelineLayout.getVk(), descriptorSet.getVk()));
    }

    public VulkanObjectEntryTypeNVX getType() {
        return new VulkanObjectEntryTypeNVX(getVk().getType());
    }

    public void setType(VulkanObjectEntryTypeNVX type) {
        getVk().setType(type.getVk());
    }

    public VulkanObjectEntryUsageFlagsNVX getFlags() {
        return new VulkanObjectEntryUsageFlagsNVX(getVk().getFlags());
    }

    public void setFlags(VulkanObjectEntryUsageFlagsNVX flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanPipelineLayout getPipelineLayout() {
        return new VulkanPipelineLayout(getVk().getPipelineLayout());
    }

    public void setPipelineLayout(VulkanPipelineLayout pipelineLayout) {
        getVk().setPipelineLayout(pipelineLayout.getVk());
    }

    public VulkanDescriptorSet getDescriptorSet() {
        return new VulkanDescriptorSet(getVk().getDescriptorSet());
    }

    public void setDescriptorSet(VulkanDescriptorSet descriptorSet) {
        getVk().setDescriptorSet(descriptorSet.getVk());
    }


    public static class Array extends VulkanObjectTableDescriptorSetEntryNVX implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTableDescriptorSetEntryNVX> {
        public Array(VkObjectTableDescriptorSetEntryNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkObjectTableDescriptorSetEntryNVX.Array(count));
        }

        public Array(int count, VulkanObjectTableDescriptorSetEntryNVX o){
            this(new VkObjectTableDescriptorSetEntryNVX.Array(count, o.getVk()));
        }

        @Override
        public VkObjectTableDescriptorSetEntryNVX.Array getVk(){
            return (VkObjectTableDescriptorSetEntryNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanObjectTableDescriptorSetEntryNVX get(int i){
            return new VulkanObjectTableDescriptorSetEntryNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkObjectTableDescriptorSetEntryNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkObjectTableDescriptorSetEntryNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkObjectTableDescriptorSetEntryNVX.Pointer(value));
        }

        @Override
        public VkObjectTableDescriptorSetEntryNVX.Pointer getVk(){
            return (VkObjectTableDescriptorSetEntryNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanObjectTableDescriptorSetEntryNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTableDescriptorSetEntryNVX.Pointer> {
            public Array(int count) {
                super(new VkObjectTableDescriptorSetEntryNVX.Pointer.Array(count));
            }

            public Array(VulkanObjectTableDescriptorSetEntryNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkObjectTableDescriptorSetEntryNVX.Pointer.Array getVk(){
                return (VkObjectTableDescriptorSetEntryNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanObjectTableDescriptorSetEntryNVX.Pointer get(int i){
                return new VulkanObjectTableDescriptorSetEntryNVX.Pointer(getVk().get(i));
            }
        }
    }
}
