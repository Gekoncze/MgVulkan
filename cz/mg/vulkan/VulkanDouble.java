package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/double.html">khronos documentation</a>
 **/
public class VulkanDouble extends VulkanObject {
    public VulkanDouble(){
        super(new VkDouble());
    }

    public VulkanDouble(VkDouble vk){
        super(vk);
    }

    @Override
    public VkDouble getVk(){
        return (VkDouble) super.getVk();
    }

    public VulkanDouble(double value){
        super(new VkDouble(value));
    }

    public double getValue(){
        return getVk().getValue();
    }

    public void setValue(double value){
        getVk().setValue(value);
    }

    public static class Array extends VulkanDouble implements cz.mg.collections.array.ReadonlyArray<VulkanDouble> {
        public Array(VkDouble.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDouble.Array(count));
        }

        public Array(int count, VulkanDouble o){
            this(new VkDouble.Array(count, o.getVk()));
        }

        @Override
        public VkDouble.Array getVk(){
            return (VkDouble.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDouble get(int i){
            return new VulkanDouble(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDouble.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDouble.Pointer());
        }

        public Pointer(long value) {
            this(new VkDouble.Pointer(value));
        }

        @Override
        public VkDouble.Pointer getVk(){
            return (VkDouble.Pointer) super.getVk();
        }

        public static class Array extends VulkanDouble.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDouble.Pointer> {
            public Array(int count) {
                super(new VkDouble.Pointer.Array(count));
            }

            public Array(VulkanDouble[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDouble.Pointer.Array getVk(){
                return (VkDouble.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDouble.Pointer get(int i){
                return new VulkanDouble.Pointer(getVk().get(i));
            }
        }
    }
}
