package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndexType.html">khronos documentation</a>
 **/
public class VulkanIndexType extends VulkanEnum {
    public static final int UINT16 = VkIndexType.VK_INDEX_TYPE_UINT16;
    public static final int UINT32 = VkIndexType.VK_INDEX_TYPE_UINT32;

    public VulkanIndexType(){
        super(new VkIndexType());
    }

    public VulkanIndexType(VkIndexType vk){
        super(vk);
    }

    @Override
    public VkIndexType getVk(){
        return (VkIndexType) super.getVk();
    }

    public VulkanIndexType(int value){
        super(new VkIndexType(value));
    }

    @Override
    public String toString() {
        if(getValue() == UINT16) return "UINT16";
        if(getValue() == UINT32) return "UINT32";
        return "UNKNOWN";
    }

    public static class Array extends VulkanIndexType implements cz.mg.collections.array.ReadonlyArray<VulkanIndexType> {
        public Array(VkIndexType.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkIndexType.Array(count));
        }

        public Array(int count, VulkanIndexType o){
            this(new VkIndexType.Array(count, o.getVk()));
        }

        @Override
        public VkIndexType.Array getVk(){
            return (VkIndexType.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanIndexType get(int i){
            return new VulkanIndexType(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkIndexType.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkIndexType.Pointer());
        }

        public Pointer(long value) {
            this(new VkIndexType.Pointer(value));
        }

        @Override
        public VkIndexType.Pointer getVk(){
            return (VkIndexType.Pointer) super.getVk();
        }

        public static class Array extends VulkanIndexType.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanIndexType.Pointer> {
            public Array(int count) {
                super(new VkIndexType.Pointer.Array(count));
            }

            public Array(VulkanIndexType[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkIndexType.Pointer.Array getVk(){
                return (VkIndexType.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanIndexType.Pointer get(int i){
                return new VulkanIndexType.Pointer(getVk().get(i));
            }
        }
    }
}
