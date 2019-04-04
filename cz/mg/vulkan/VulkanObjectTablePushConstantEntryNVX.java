package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkObjectTablePushConstantEntryNVX.html">khronos documentation</a>
 **/
public class VulkanObjectTablePushConstantEntryNVX extends VulkanObject {
    public VulkanObjectTablePushConstantEntryNVX(){
        super(new VkObjectTablePushConstantEntryNVX());
    }

    public VulkanObjectTablePushConstantEntryNVX(VkObjectTablePushConstantEntryNVX vk){
        super(vk);
    }

    @Override
    public VkObjectTablePushConstantEntryNVX getVk(){
        return (VkObjectTablePushConstantEntryNVX) super.getVk();
    }

    public VulkanObjectTablePushConstantEntryNVX(VulkanObjectEntryTypeNVX type, VulkanObjectEntryUsageFlagsNVX flags, VulkanPipelineLayout pipelineLayout, VulkanShaderStageFlags stageFlags) {
        super(new VkObjectTablePushConstantEntryNVX(type.getVk(), flags.getVk(), pipelineLayout.getVk(), stageFlags.getVk()));
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

    public VulkanShaderStageFlags getStageFlags() {
        return new VulkanShaderStageFlags(getVk().getStageFlags());
    }

    public void setStageFlags(VulkanShaderStageFlags stageFlags) {
        getVk().setStageFlags(stageFlags.getVk());
    }


    public static class Array extends VulkanObjectTablePushConstantEntryNVX implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTablePushConstantEntryNVX> {
        public Array(VkObjectTablePushConstantEntryNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkObjectTablePushConstantEntryNVX.Array(count));
        }

        public Array(int count, VulkanObjectTablePushConstantEntryNVX o){
            this(new VkObjectTablePushConstantEntryNVX.Array(count, o.getVk()));
        }

        @Override
        public VkObjectTablePushConstantEntryNVX.Array getVk(){
            return (VkObjectTablePushConstantEntryNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanObjectTablePushConstantEntryNVX get(int i){
            return new VulkanObjectTablePushConstantEntryNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkObjectTablePushConstantEntryNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkObjectTablePushConstantEntryNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkObjectTablePushConstantEntryNVX.Pointer(value));
        }

        @Override
        public VkObjectTablePushConstantEntryNVX.Pointer getVk(){
            return (VkObjectTablePushConstantEntryNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanObjectTablePushConstantEntryNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTablePushConstantEntryNVX.Pointer> {
            public Array(int count) {
                super(new VkObjectTablePushConstantEntryNVX.Pointer.Array(count));
            }

            public Array(VulkanObjectTablePushConstantEntryNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkObjectTablePushConstantEntryNVX.Pointer.Array getVk(){
                return (VkObjectTablePushConstantEntryNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanObjectTablePushConstantEntryNVX.Pointer get(int i){
                return new VulkanObjectTablePushConstantEntryNVX.Pointer(getVk().get(i));
            }
        }
    }
}
