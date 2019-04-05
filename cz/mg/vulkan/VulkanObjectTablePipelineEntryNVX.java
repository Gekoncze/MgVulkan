package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanObjectTablePipelineEntryNVX extends VulkanObject {
    public VulkanObjectTablePipelineEntryNVX(){
        super(new VkObjectTablePipelineEntryNVX());
    }

    public VulkanObjectTablePipelineEntryNVX(VkObjectTablePipelineEntryNVX vk){
        super(vk);
    }

    @Override
    public VkObjectTablePipelineEntryNVX getVk(){
        return (VkObjectTablePipelineEntryNVX) super.getVk();
    }

    public VulkanObjectTablePipelineEntryNVX(VulkanObjectEntryTypeNVX type, VulkanObjectEntryUsageFlagsNVX flags, VulkanPipeline pipeline) {
        super(new VkObjectTablePipelineEntryNVX(type.getVk(), flags.getVk(), pipeline.getVk()));
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

    public VulkanPipeline getPipeline() {
        return new VulkanPipeline(getVk().getPipeline());
    }

    public void setPipeline(VulkanPipeline pipeline) {
        getVk().setPipeline(pipeline.getVk());
    }


    public static class Array extends VulkanObjectTablePipelineEntryNVX implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTablePipelineEntryNVX> {
        public Array(VkObjectTablePipelineEntryNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkObjectTablePipelineEntryNVX.Array(count));
        }

        public Array(int count, VulkanObjectTablePipelineEntryNVX o){
            this(new VkObjectTablePipelineEntryNVX.Array(count, o.getVk()));
        }

        @Override
        public VkObjectTablePipelineEntryNVX.Array getVk(){
            return (VkObjectTablePipelineEntryNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanObjectTablePipelineEntryNVX get(int i){
            return new VulkanObjectTablePipelineEntryNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkObjectTablePipelineEntryNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkObjectTablePipelineEntryNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkObjectTablePipelineEntryNVX.Pointer(value));
        }

        @Override
        public VkObjectTablePipelineEntryNVX.Pointer getVk(){
            return (VkObjectTablePipelineEntryNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanObjectTablePipelineEntryNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTablePipelineEntryNVX.Pointer> {
            public Array(int count) {
                super(new VkObjectTablePipelineEntryNVX.Pointer.Array(count));
            }

            public Array(VulkanObjectTablePipelineEntryNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkObjectTablePipelineEntryNVX.Pointer.Array getVk(){
                return (VkObjectTablePipelineEntryNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanObjectTablePipelineEntryNVX.Pointer get(int i){
                return new VulkanObjectTablePipelineEntryNVX.Pointer(getVk().get(i));
            }
        }
    }
}
