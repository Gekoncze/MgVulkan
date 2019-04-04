package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryType.html">khronos documentation</a>
 **/
public class VulkanQueryType extends VulkanEnum {
    public static final int OCCLUSION = VkQueryType.VK_QUERY_TYPE_OCCLUSION;
    public static final int PIPELINE_STATISTICS = VkQueryType.VK_QUERY_TYPE_PIPELINE_STATISTICS;
    public static final int TIMESTAMP = VkQueryType.VK_QUERY_TYPE_TIMESTAMP;

    public VulkanQueryType(){
        super(new VkQueryType());
    }

    public VulkanQueryType(VkQueryType vk){
        super(vk);
    }

    @Override
    public VkQueryType getVk(){
        return (VkQueryType) super.getVk();
    }

    public VulkanQueryType(int value){
        super(new VkQueryType(value));
    }

    @Override
    public String toString() {
        if(getValue() == OCCLUSION) return "OCCLUSION";
        if(getValue() == PIPELINE_STATISTICS) return "PIPELINE_STATISTICS";
        if(getValue() == TIMESTAMP) return "TIMESTAMP";
        return "UNKNOWN";
    }

    public static class Array extends VulkanQueryType implements cz.mg.collections.array.ReadonlyArray<VulkanQueryType> {
        public Array(VkQueryType.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueryType.Array(count));
        }

        public Array(int count, VulkanQueryType o){
            this(new VkQueryType.Array(count, o.getVk()));
        }

        @Override
        public VkQueryType.Array getVk(){
            return (VkQueryType.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueryType get(int i){
            return new VulkanQueryType(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueryType.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueryType.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueryType.Pointer(value));
        }

        @Override
        public VkQueryType.Pointer getVk(){
            return (VkQueryType.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueryType.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueryType.Pointer> {
            public Array(int count) {
                super(new VkQueryType.Pointer.Array(count));
            }

            public Array(VulkanQueryType[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueryType.Pointer.Array getVk(){
                return (VkQueryType.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueryType.Pointer get(int i){
                return new VulkanQueryType.Pointer(getVk().get(i));
            }
        }
    }
}
