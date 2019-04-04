package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/int.html">khronos documentation</a>
 **/
public class VulkanInt extends VulkanObject {
    public VulkanInt(){
        super(new VkInt());
    }

    public VulkanInt(VkInt vk){
        super(vk);
    }

    @Override
    public VkInt getVk(){
        return (VkInt) super.getVk();
    }

    public VulkanInt(int value){
        super(new VkInt(value));
    }

    public int getValue(){
        return getVk().getValue();
    }

    public void setValue(int value){
        getVk().setValue(value);
    }

    public static class Array extends VulkanInt implements cz.mg.collections.array.ReadonlyArray<VulkanInt> {
        public Array(VkInt.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkInt.Array(count));
        }

        public Array(int count, VulkanInt o){
            this(new VkInt.Array(count, o.getVk()));
        }

        @Override
        public VkInt.Array getVk(){
            return (VkInt.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanInt get(int i){
            return new VulkanInt(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkInt.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkInt.Pointer());
        }

        public Pointer(long value) {
            this(new VkInt.Pointer(value));
        }

        @Override
        public VkInt.Pointer getVk(){
            return (VkInt.Pointer) super.getVk();
        }

        public static class Array extends VulkanInt.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanInt.Pointer> {
            public Array(int count) {
                super(new VkInt.Pointer.Array(count));
            }

            public Array(VulkanInt[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkInt.Pointer.Array getVk(){
                return (VkInt.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanInt.Pointer get(int i){
                return new VulkanInt.Pointer(getVk().get(i));
            }
        }
    }
}
