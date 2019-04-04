package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryPipelineStatisticFlags.html">khronos documentation</a>
 **/
public class VulkanQueryPipelineStatisticFlags extends VulkanFlags {
    public VulkanQueryPipelineStatisticFlags(){
        super(new VkQueryPipelineStatisticFlags());
    }

    public VulkanQueryPipelineStatisticFlags(VkQueryPipelineStatisticFlags vk){
        super(vk);
    }

    @Override
    public VkQueryPipelineStatisticFlags getVk(){
        return (VkQueryPipelineStatisticFlags) super.getVk();
    }

    public VulkanQueryPipelineStatisticFlags(int value){
        super(new VkQueryPipelineStatisticFlags(value));
    }

    public static class Array extends VulkanQueryPipelineStatisticFlags implements cz.mg.collections.array.ReadonlyArray<VulkanQueryPipelineStatisticFlags> {
        public Array(VkQueryPipelineStatisticFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueryPipelineStatisticFlags.Array(count));
        }

        public Array(int count, VulkanQueryPipelineStatisticFlags o){
            this(new VkQueryPipelineStatisticFlags.Array(count, o.getVk()));
        }

        @Override
        public VkQueryPipelineStatisticFlags.Array getVk(){
            return (VkQueryPipelineStatisticFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueryPipelineStatisticFlags get(int i){
            return new VulkanQueryPipelineStatisticFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueryPipelineStatisticFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueryPipelineStatisticFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueryPipelineStatisticFlags.Pointer(value));
        }

        @Override
        public VkQueryPipelineStatisticFlags.Pointer getVk(){
            return (VkQueryPipelineStatisticFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueryPipelineStatisticFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueryPipelineStatisticFlags.Pointer> {
            public Array(int count) {
                super(new VkQueryPipelineStatisticFlags.Pointer.Array(count));
            }

            public Array(VulkanQueryPipelineStatisticFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueryPipelineStatisticFlags.Pointer.Array getVk(){
                return (VkQueryPipelineStatisticFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueryPipelineStatisticFlags.Pointer get(int i){
                return new VulkanQueryPipelineStatisticFlags.Pointer(getVk().get(i));
            }
        }
    }
}
