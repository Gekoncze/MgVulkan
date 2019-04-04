package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/uint64_t.html">khronos documentation</a>
 **/
public class VulkanUInt64 extends VulkanObject {
    public VulkanUInt64(){
        super(new VkUInt64());
    }

    public VulkanUInt64(VkUInt64 vk){
        super(vk);
    }

    @Override
    public VkUInt64 getVk(){
        return (VkUInt64) super.getVk();
    }

    public VulkanUInt64(long value){
        super(new VkUInt64(value));
    }

    public long getValue(){
        return getVk().getValue();
    }

    public void setValue(long value){
        getVk().setValue(value);
    }

    public static class Array extends VulkanUInt64 implements cz.mg.collections.array.ReadonlyArray<VulkanUInt64> {
        public Array(VkUInt64.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkUInt64.Array(count));
        }

        public Array(int count, VulkanUInt64 o){
            this(new VkUInt64.Array(count, o.getVk()));
        }

        @Override
        public VkUInt64.Array getVk(){
            return (VkUInt64.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanUInt64 get(int i){
            return new VulkanUInt64(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkUInt64.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkUInt64.Pointer());
        }

        public Pointer(long value) {
            this(new VkUInt64.Pointer(value));
        }

        @Override
        public VkUInt64.Pointer getVk(){
            return (VkUInt64.Pointer) super.getVk();
        }

        public static class Array extends VulkanUInt64.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanUInt64.Pointer> {
            public Array(int count) {
                super(new VkUInt64.Pointer.Array(count));
            }

            public Array(VulkanUInt64[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkUInt64.Pointer.Array getVk(){
                return (VkUInt64.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanUInt64.Pointer get(int i){
                return new VulkanUInt64.Pointer(getVk().get(i));
            }
        }
    }
}
